package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;

/* loaded from: classes.dex */
public final /* synthetic */ class sz5 implements bg1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ sz5(byte b) {
        this.a = b;
    }

    private final void a(Object obj) {
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (!sharedPreferences.contains("previous_show_time")) {
                    am2.x(sharedPreferences.edit(), "previous_show_time");
                    break;
                }
                break;
            case 2:
                break;
            default:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    sharedPreferences2.contains("nothing");
                    break;
                }
                break;
        }
    }
}
