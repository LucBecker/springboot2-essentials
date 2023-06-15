package academy.devdojo.springboot2essentials.exception;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.hibernate.internal.util.StringHelper;

@Data
@SuperBuilder
public class ValidationExceptionDetails extends ExceptionDetails{
    private final String fields;
    private final String fieldsMessage;

}
