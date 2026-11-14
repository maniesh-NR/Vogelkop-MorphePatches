package defpackage;

/* loaded from: classes.dex */
public enum del implements xeb {
    TEMPERATURE_UNIT_UNSPECIFIED(0),
    TEMPERATURE_UNIT_CELSIUS(1),
    TEMPERATURE_UNIT_FAHRENHEIT(2),
    UNRECOGNIZED(-1);

    public final int a;

    del(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        qp2.o("Can't get the number of an unknown enum value.");
        return 0;
    }
}
