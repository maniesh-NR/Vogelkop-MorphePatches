package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import java.util.Collections;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dtf implements ks2 {
    public static final /* synthetic */ dtf[] c;
    public static final /* synthetic */ h58 d;
    public final Set a;
    public final nf2 b;

    static {
        Set setSingleton = Collections.singleton("bday");
        nf2 nf2Var = nf2.BIRTHDAY;
        dtf dtfVar = new dtf("BIRTH_DATE", 0, setSingleton, nf2Var);
        dtf dtfVar2 = new dtf("BIRTHDATE_DAY", 1, Collections.singleton("bday-day"), nf2Var);
        dtf dtfVar3 = new dtf("BIRTHDATE_MONTH", 2, Collections.singleton("bday-month"), nf2Var);
        dtf dtfVar4 = new dtf("BIRTHDATE_YEAR", 3, Collections.singleton("bday-year"), nf2Var);
        Set setSingleton2 = Collections.singleton("language");
        nf2 nf2Var2 = nf2.OTHER;
        dtf[] dtfVarArr = {dtfVar, dtfVar2, dtfVar3, dtfVar4, new dtf("LANGUAGE", 4, setSingleton2, nf2Var2), new dtf("NICKNAME", 5, Collections.singleton("nickname"), nf2Var2), new dtf("ORGANIZATION", 6, Collections.singleton("organization"), nf2Var2), new dtf("ORGANIZATION_TITLE", 7, Collections.singleton("organization-title"), nf2Var2), new dtf("PHOTO", 8, Collections.singleton("photo"), nf2Var2), new dtf("SEX", 9, Collections.singleton("sex"), nf2.GENDER), new dtf("TRANSACTION_AMOUNT", 10, Collections.singleton("transaction-amount"), nf2Var2), new dtf("TRANSACTION_CURRENCY", 11, Collections.singleton("transaction-currency"), nf2Var2), new dtf(MessageTemplateConstants.Args.URL, 12, Collections.singleton(ImagesContract.URL), nf2Var2)};
        c = dtfVarArr;
        d = new h58(dtfVarArr);
    }

    public dtf(String str, int i, Set set, nf2 nf2Var) {
        this.a = set;
        this.b = nf2Var;
    }

    public static dtf valueOf(String str) {
        return (dtf) Enum.valueOf(dtf.class, str);
    }

    public static dtf[] values() {
        return (dtf[]) c.clone();
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
