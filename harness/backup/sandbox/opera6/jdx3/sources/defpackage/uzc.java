package defpackage;

import com.leanplum.internal.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class uzc {
    public static final /* synthetic */ uzc[] b;
    public static final /* synthetic */ h58 c;
    public final String a;

    static {
        uzc[] uzcVarArr = {new uzc("ID", 0, "id"), new uzc("PARENT_ID", 1, "parent_id"), new uzc("KEY", 2, "key"), new uzc("VALUE", 3, Constants.Params.VALUE), new uzc("DATE_CREATED", 4, "date_created"), new uzc("CONFIDENTIAL", 5, "confidential")};
        b = uzcVarArr;
        c = new h58(uzcVarArr);
    }

    public uzc(String str, int i, String str2) {
        this.a = str2;
    }

    public static uzc valueOf(String str) {
        return (uzc) Enum.valueOf(uzc.class, str);
    }

    public static uzc[] values() {
        return (uzc[]) b.clone();
    }
}
