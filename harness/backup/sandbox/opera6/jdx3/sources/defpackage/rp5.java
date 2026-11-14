package defpackage;

import com.leanplum.internal.Constants;
import java.util.Collections;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rp5 implements ks2 {
    public static final /* synthetic */ rp5[] c;
    public static final /* synthetic */ h58 d;
    public final Set a;
    public final nf2 b;

    static {
        Set setE = e82.E(new String[]{"additional-name", "personMiddleName"});
        nf2 nf2Var = nf2.NAME;
        rp5 rp5Var = new rp5("ADDITIONAL_NAME", 0, setE, nf2Var);
        rp5 rp5Var2 = new rp5("FAMILY_NAME", 1, e82.E(new String[]{"family-name", "personFamilyName"}), nf2Var);
        rp5 rp5Var3 = new rp5("GIVEN_NAME", 2, e82.E(new String[]{"given-name", "personGivenName"}), nf2Var);
        rp5 rp5Var4 = new rp5("HONORIFIC_PREFIX", 3, Collections.singleton("honorific-prefix"), nf2Var);
        rp5 rp5Var5 = new rp5("HONORIFIC_SUFFIX", 4, Collections.singleton("honorific-suffix"), nf2Var);
        rp5 rp5Var6 = new rp5("NAME", 5, e82.E(new String[]{Constants.Params.NAME, Constants.Params.NAME}), nf2Var);
        Set setE2 = e82.E(new String[]{"tel", "phone"});
        nf2 nf2Var2 = nf2.PHONE;
        rp5[] rp5VarArr = {rp5Var, rp5Var2, rp5Var3, rp5Var4, rp5Var5, rp5Var6, new rp5("PHONE", 6, setE2, nf2Var2), new rp5("PHONE_AREA_CODE", 7, Collections.singleton("tel-area-code"), nf2Var2), new rp5("PHONE_COUNTRY_CODE", 8, Collections.singleton("tel-country-code"), nf2Var2), new rp5("PHONE_EXTENSION", 9, Collections.singleton("tel-extension"), nf2Var2), new rp5("PHONE_LOCAL", 10, Collections.singleton("tel-local"), nf2Var2), new rp5("PHONE_LOCAL_PREFIX", 11, Collections.singleton("tel-local-prefix"), nf2Var2), new rp5("PHONE_LOCAL_SUFFIX", 12, Collections.singleton("tel-local-suffix"), nf2Var2), new rp5("PHONE_NATIONAL", 13, Collections.singleton("tel-national"), nf2Var2)};
        c = rp5VarArr;
        d = new h58(rp5VarArr);
    }

    public rp5(String str, int i, Set set, nf2 nf2Var) {
        this.a = set;
        this.b = nf2Var;
    }

    public static rp5 valueOf(String str) {
        return (rp5) Enum.valueOf(rp5.class, str);
    }

    public static rp5[] values() {
        return (rp5[]) c.clone();
    }

    @Override // defpackage.ks2
    public final nf2 d() {
        return this.b;
    }

    @Override // defpackage.ks2
    public final Set g() {
        return this.a;
    }
}
