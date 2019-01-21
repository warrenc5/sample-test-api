package devnull.mnf.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;
    
    String name;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date created;

    @OneToMany(targetEntity = Invoice.class, cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    Collection<Invoice> invoices;

    Account account;

    @Transient
    Double customerTotal;
}
