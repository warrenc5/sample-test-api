package devnull.mnf.model;

import java.util.Collection;
import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
@Data
public class Customer {
    Integer id;
    String name;
    Date create;
    Collection<Invoice> invoices;
}
