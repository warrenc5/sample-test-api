package devnull.mnf.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Account implements Serializable {

    @Id
    String name;
    String description;
    @OneToMany(targetEntity = Customer.class, mappedBy = "account", cascade = {}, fetch = FetchType.EAGER)
    Collection<Customer> customers;

    @Transient
    @Builder.Default
    Double accountTotal = 0. ;
}
