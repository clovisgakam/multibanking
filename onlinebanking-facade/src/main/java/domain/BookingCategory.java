package domain;

import lombok.Builder;
import lombok.Data;

/**
 * Created by alexg on 18.05.17.
 */
@Data
@Builder
public class BookingCategory {

    private String mainCategory;
    private String subCategory;
    private String specification;
    private boolean variable;
    private Contract contract;


}
