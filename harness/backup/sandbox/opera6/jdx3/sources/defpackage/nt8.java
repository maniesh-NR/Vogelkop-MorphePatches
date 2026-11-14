package defpackage;

import java.util.ArrayList;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nt8 {
    public static final /* synthetic */ nt8[] g;
    public static final /* synthetic */ h58 h;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final ArrayList f;

    static {
        nt8[] nt8VarArr = {new nt8("ESIM", 0, "esim", "esim", "ofa://ui/esim?source=feature_suggestion", 2132020174, 2132020173, "esim", "virtual sim"), new nt8("VPN_PRO", 1, "vpn", "vpn_pro", "ofa://ui/upgrade?source=feature_suggestion", 2132020175, 2132020176, "vpn")};
        g = nt8VarArr;
        h = new h58(nt8VarArr);
    }

    public nt8(String str, int i, String str2, String str3, String str4, int i2, int i3, String... strArr) {
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = i2;
        this.e = i3;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str5 : strArr) {
            arrayList.add(StringsKt.X(str5, new char[]{' '}));
        }
        this.f = arrayList;
    }

    public static nt8 valueOf(String str) {
        return (nt8) Enum.valueOf(nt8.class, str);
    }

    public static nt8[] values() {
        return (nt8[]) g.clone();
    }
}
