package defpackage;

/* loaded from: classes.dex */
public enum nf2 {
    ADDRESS(2),
    NAME(0),
    PHONE(0),
    EMAIL_ADDRESS(16),
    IMPP(16),
    PASSWORD(1),
    USERNAME(8),
    CREDIT_CARD(4),
    GENDER(0),
    BIRTHDAY(0),
    SIGNUP_USERNAME(0),
    SIGNUP_PASSWORD(0),
    OTHER(0);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    nf2(int i) {
        this.a = i;
    }
}
