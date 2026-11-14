package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class pff {
    private final Field caseField;
    private final int id;
    private final Field valueField;

    public pff(int i, Field field, Field field2) {
        this.id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.id;
    }

    public Field getValueField() {
        return this.valueField;
    }
}
