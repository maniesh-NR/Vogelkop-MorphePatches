package defpackage;

import com.leanplum.internal.Constants;
import java.util.Collections;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class iw implements ks2 {
    public static final /* synthetic */ iw[] b;
    public static final /* synthetic */ h58 c;
    public final Set a;

    static {
        Set setSingleton = Collections.singleton("address-level1");
        nf2 nf2Var = nf2.ADDRESS;
        iw[] iwVarArr = {new iw(setSingleton, 0, "ADDRESS_LEVEL_1"), new iw(Collections.singleton("address-level2"), 1, "ADDRESS_LEVEL_2"), new iw(Collections.singleton("address-level3"), 2, "ADDRESS_LEVEL_3"), new iw(Collections.singleton("address-level4"), 3, "ADDRESS_LEVEL_4"), new iw(Collections.singleton("address-line1"), 4, "ADDRESS_LINE_1"), new iw(Collections.singleton("address-line2"), 5, "ADDRESS_LINE_2"), new iw(Collections.singleton("address-line3"), 6, "ADDRESS_LINE_3"), new iw(Collections.singleton(Constants.Keys.COUNTRY), 7, "COUNTRY"), new iw(Collections.singleton("country-name"), 8, "COUNTRY_NAME"), new iw(Collections.singleton("postalCode"), 9, "POSTAL_CODE"), new iw(e82.E(new String[]{"street-address", "postalAddress"}), 10, "STREET_ADDRESS")};
        b = iwVarArr;
        c = new h58(iwVarArr);
    }

    public iw(Set set, int i, String str) {
        nf2 nf2Var = nf2.ADDRESS;
        this.a = set;
    }

    public static iw valueOf(String str) {
        return (iw) Enum.valueOf(iw.class, str);
    }

    public static iw[] values() {
        return (iw[]) b.clone();
    }

    @Override // defpackage.ks2
    public final nf2 d() {
        return nf2.ADDRESS;
    }

    @Override // defpackage.ks2
    public final Set g() {
        return this.a;
    }
}
