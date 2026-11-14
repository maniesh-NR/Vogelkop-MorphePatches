package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f16 implements ks2 {
    public static final /* synthetic */ f16[] b;
    public static final /* synthetic */ h58 c;
    public final Set a;

    static {
        Set setSingleton = Collections.singleton("cc-additional-name");
        nf2 nf2Var = nf2.ADDRESS;
        f16[] f16VarArr = {new f16(setSingleton, 0, "CREDIT_CARD_ADDITIONAL_NAME"), new f16(e82.E(new String[]{"cc-csc", "creditCardSecurityCode"}), 1, "CREDIT_CARD_CSC"), new f16(e82.E(new String[]{"cc-exp", "creditCardExpirationDate"}), 2, "CREDIT_CARD_EXPIRATION_DATE"), new f16(Collections.singleton("creditCardExpirationDay"), 3, "CREDIT_CARD_EXPIRATION_DATE_DAY"), new f16(e82.E(new String[]{"cc-exp-month", "creditCardExpirationMonth"}), 4, "CREDIT_CARD_EXPIRATION_DATE_MONTH"), new f16(e82.E(new String[]{"cc-exp-year", "creditCardExpirationYear"}), 5, "CREDIT_CARD_EXPIRATION_DATE_YEAR"), new f16(Collections.singleton("cc-family-name"), 6, "CREDIT_CARD_FAMILY_NAME"), new f16(Collections.singleton("cc-given-name"), 7, "CREDIT_CARD_GIVEN_NAME"), new f16(Collections.singleton("cc-name"), 8, "CREDIT_CARD_NAME"), new f16(e82.E(new String[]{"cc-number", "creditCardNumber"}), 9, "CREDIT_CARD_NUMBER"), new f16(Collections.singleton("cc-type"), 10, "CREDIT_CARD_TYPE")};
        b = f16VarArr;
        c = new h58(f16VarArr);
    }

    public f16(Set set, int i, String str) {
        nf2 nf2Var = nf2.ADDRESS;
        this.a = set;
    }

    public static f16 valueOf(String str) {
        return (f16) Enum.valueOf(f16.class, str);
    }

    public static f16[] values() {
        return (f16[]) b.clone();
    }

    @Override // defpackage.ks2
    public final nf2 d() {
        return nf2.CREDIT_CARD;
    }

    @Override // defpackage.ks2
    public final Set g() {
        return this.a;
    }
}
