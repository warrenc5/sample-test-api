package devnull.mnf.model;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
@Data
public class Invoice {
    
    Integer id;
    String description;
    Date purchased;
    Float currency;
}
