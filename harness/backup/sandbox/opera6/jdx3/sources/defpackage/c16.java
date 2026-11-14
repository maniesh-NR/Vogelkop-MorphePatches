package defpackage;

import com.leanplum.internal.Constants;
import java.util.Collections;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c16 implements ks2 {
    public static final /* synthetic */ c16[] c;
    public static final /* synthetic */ h58 d;
    public final Set a;
    public final nf2 b;

    static {
        c16[] c16VarArr = {new c16("EMAIL", 0, e82.E(new String[]{Constants.Params.EMAIL, "emailAddress"}), nf2.EMAIL_ADDRESS), new c16("IMPP", 1, Collections.singleton("impp"), nf2.IMPP), new c16("NEW_USERNAME", 2, Collections.singleton("newUsername"), nf2.SIGNUP_USERNAME), new c16("NEW_PASSWORD", 3, Collections.singleton("newPassword"), nf2.SIGNUP_PASSWORD), new c16("PASSWORD", 4, e82.E(new String[]{"current-password", "passwordAuto", "password"}), nf2.PASSWORD), new c16("USERNAME", 5, e82.E(new String[]{"webauthn", "username"}), nf2.USERNAME)};
        c = c16VarArr;
        d = new h58(c16VarArr);
    }

    public c16(String str, int i, Set set, nf2 nf2Var) {
        this.a = set;
        this.b = nf2Var;
    }

    public static c16 valueOf(String str) {
        return (c16) Enum.valueOf(c16.class, str);
    }

    public static c16[] values() {
        return (c16[]) c.clone();
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
