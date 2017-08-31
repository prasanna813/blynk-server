package cc.blynk.server.core.model.widgets.others.eventor.model.condition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 01.08.16.
 */
public class NotEqual extends BaseCondition {

    private final double value;

    @JsonCreator
    public NotEqual(@JsonProperty("value") double value) {
        this.value = value;
    }

    @Override
    public boolean isValid(double in) {
        return in != value;
    }

}
