package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class gc7 {
    public static final u1b c = u1b.t("amazon", "oem_Huawei_appgallery", "samsungappstore", "oem_ofa_honor_store", "oem_ofa_xiaomi_offline", "oem_ofa_sliide_offline", new String[]{"oem_ofa_lenovo_offline", "oem_ofa_lenovo_tablet"});
    public final Context a;
    public final ay b = new ay((Object) this, (byte) 4);

    public gc7(Context context) {
        this.a = context.getApplicationContext();
    }

    public final String a() {
        return ((fc7) this.b.get()).a;
    }

    public final boolean b() {
        return c.contains(a());
    }
}
