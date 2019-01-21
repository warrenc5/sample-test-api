package devnull.mnf.resource;

import java.util.function.Supplier;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.ExceptionMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultExceptionMapper implements ExceptionMapper<Exception> {

    protected Logger logger = Logger.getLogger(this.getClass().getName());
    @Context
    protected UriInfo uriInfo;

    protected String exceptionStackTraceFilter(Throwable ex) {
        return uriInfo.getPath() + " " + new ExceptionStackTraceFilter(ex).get();
    }

    @Override
    public Response toResponse(Exception ex) {
        log.error(exceptionStackTraceFilter(ex));
        return Response.serverError().build();
    }

    public static class ExceptionStackTraceFilter implements Supplier<String> {

        private final Throwable x;

        public ExceptionStackTraceFilter(Throwable x) {
            this.x = x;
        }

        @Override
        public String get() {
            return processessException(x).toString();
        }

        private StringBuilder processessException(Throwable x) {
            StringBuilder builder = new StringBuilder();

            builder.append(x.getClass()).append(" -- ").append(x.getMessage());

            builder.append(filterStackTrace(x.getStackTrace()));
            if (x.getCause() != null) {
                builder.append(processessException(x.getCause()).toString());
            }

            return builder;
        }

        private StringBuilder filterStackTrace(StackTraceElement[] stackTrace) {

            StringBuilder builder = new StringBuilder();

            for (StackTraceElement e : stackTrace) {
                if (e.toString().matches(".*devnull.*")) {
                    builder.append(" -- ").append(e.toString());
                }
            }
            return builder;
        }
    }
}