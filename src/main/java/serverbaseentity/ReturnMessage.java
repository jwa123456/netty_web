package serverbaseentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by jiang wei on 2017/6/28.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnMessage implements Serializable {

    private static final long serialVersionUID = 601687171739260541L;

    private Boolean isSuccess;

    private String message;

}
