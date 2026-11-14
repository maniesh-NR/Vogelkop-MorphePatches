package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.opera.android.downloads.DownloadService;
import java.util.Objects;
import org.chromium.base.CommandLine;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class a00 implements bg1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) throws SecurityException {
        byte b = this.a;
        byte b2 = 10;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((e00) obj2).d.set(new c00((SharedPreferences) obj));
                return;
            case 1:
                ev4 ev4Var = (ev4) obj2;
                DownloadService.e((Context) ev4Var.d, "ctrl_onInit");
                ((ag7) obj).a(new bl6(ev4Var, (byte) 25));
                return;
            case 2:
                CommandLine commandLine = (CommandLine) obj2;
                String str = (String) obj;
                if (str != null) {
                    commandLine.a("force-device-scale-factor", str);
                    return;
                }
                return;
            case 3:
                zv9 zv9Var = (zv9) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                synchronized (zv9Var.c) {
                    if (!(zv9Var.d.c > 0)) {
                        String string = sharedPreferences.getString("sysutil.location", "");
                        yv9 yv9Var = yv9.d;
                        if (!TextUtils.isEmpty(string)) {
                            try {
                                yv9Var = new yv9(new orb(string));
                            } catch (JSONException unused) {
                            }
                        }
                        zv9Var.d = yv9Var;
                    }
                }
                return;
            case 4:
                h0a h0aVar = (h0a) obj2;
                ((ize) h0aVar.b.get()).k(new ug(new g0a(h0aVar, (byte) 1), (byte) 23));
                return;
            case 5:
                ((SharedPreferences) obj).contains("ignored");
                vml.e(new hyc((iyc) obj2, (byte) 0));
                return;
            case 6:
                nrl nrlVar = (nrl) ((bpd) obj2).c;
                Objects.requireNonNull(nrlVar);
                vml.c(new mni(nrlVar, b2));
                return;
            case 7:
                jlf jlfVar = (jlf) obj2;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                synchronized (jlfVar.b) {
                    for (String str2 : sharedPreferences2.getAll().keySet()) {
                        if (str2.startsWith("failure_") && sharedPreferences2.getInt(str2, 0) != 0) {
                            vml.d(new vdf(jlfVar, (byte) 7), 30000L);
                        }
                    }
                }
                return;
            case 8:
                nrl nrlVar2 = (nrl) ((ta7) obj2).l;
                Objects.requireNonNull(nrlVar2);
                vml.c(new mni(nrlVar2, b2));
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                iu2 iu2Var = (iu2) obj2;
                if (vml.b()) {
                    iu2Var.run(obj);
                    return;
                } else {
                    vml.c(new jri(iu2Var, obj, (byte) 26));
                    return;
                }
            default:
                onn onnVar = (onn) obj2;
                x5f x5fVar = onnVar.e;
                long jA = onnVar.a.a(System.currentTimeMillis());
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                x56VarF.N(zpaVar).p(3, 1, jA);
                x5fVar.U0(x56VarF);
                return;
        }
    }
}
