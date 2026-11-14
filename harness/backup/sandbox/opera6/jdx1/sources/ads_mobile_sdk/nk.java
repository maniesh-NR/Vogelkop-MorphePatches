package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.p3p;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class nk {
    public static final Pattern c = Pattern.compile(".*\\.so$", 2);
    public final Context a;
    public final z6 b;

    public nk(Context context, z6 z6Var) {
        this.a = context;
        this.b = z6Var;
    }

    public final void a(String str, byte[] bArr) {
        z6 z6Var = this.b;
        if (z6Var == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            p3p.v(sb, "dbg:", str, ";");
        }
        z6Var.a.a(4007, -1L, null, sb.toString());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }
}
