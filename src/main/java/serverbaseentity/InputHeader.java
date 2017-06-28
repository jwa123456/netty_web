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
public class InputHeader implements Serializable {


    private static final long serialVersionUID = -7895939041729125345L;

    private String clazz;

    private String method;
}
