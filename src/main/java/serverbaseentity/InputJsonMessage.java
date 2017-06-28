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
public class InputJsonMessage implements Serializable {
    private static final long serialVersionUID = -6942801275722685851L;

    private String header;

    private String body;
}
