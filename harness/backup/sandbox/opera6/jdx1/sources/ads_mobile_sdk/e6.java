package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.app.NotificationCompat;
import defpackage.bwg;
import defpackage.hlo;
import defpackage.kta;
import defpackage.kyo;
import defpackage.llp;
import defpackage.uie;
import defpackage.w1p;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class e6 implements hlo {
    public final ob1 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ e6(ob1 ob1Var, byte b) {
        this.b = b;
        this.a = ob1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        PackageInfo packageInfo;
        byte b = this.b;
        int i = 0;
        ob1 ob1Var = this.a;
        switch (b) {
            case 0:
                return new d6((Context) ob1Var.a);
            case 1:
                return new a10((llp) ob1Var.a, (byte) 1);
            case 2:
                return new dm((llp) ob1Var.a);
            case 3:
                File dir = ((Context) ob1Var.a).getDir("yqzdkcache", 0);
                bwg.o(dir);
                return dir;
            case 4:
                return new ei((Context) ob1Var.a);
            case 5:
                return new gg3((Context) ob1Var.a);
            case 6:
                Context context = (Context) ob1Var.a;
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(context.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY)) != null) {
                    i = packageInfo.versionCode;
                }
                return Integer.valueOf(i);
            case 7:
                return new pb1((Context) ob1Var.a);
            case 8:
                return new pb1((Context) ob1Var.a);
            case 9:
                return new c02((kyo) ob1Var.a, (byte) 1);
            case 10:
                j71 j71Var = (j71) ob1Var.a;
                bwg.o(j71Var);
                return j71Var;
            case 11:
                return new mm(((Boolean) ob1Var.a).booleanValue());
            case 12:
                j71 j71Var2 = (j71) ob1Var.a;
                bwg.o(j71Var2);
                return j71Var2;
            case 13:
                return new e7((kta) ob1Var.a, (byte) 16);
            case 14:
                return new a10((xv) ob1Var.a, (byte) 4);
            case 15:
                av2 av2Var = (av2) ob1Var.a;
                bwg.o(av2Var);
                return av2Var;
            case 16:
                return new sg2((a2) ob1Var.a, new w1p(), (byte) 0);
            case 17:
                Object obj = (defpackage.r83) ob1Var.a;
                uie uieVar = obj instanceof uie ? (uie) obj : null;
                Set setSingleton = (uieVar != null ? uieVar.l() : null) != null ? Collections.singleton(av2.f) : v08.a;
                bwg.o(setSingleton);
                return setSingleton;
            case 18:
                return new vr((Context) ob1Var.a);
            case 19:
                return new nm0((ExecutorService) ob1Var.a);
            case 20:
                return new xr2((llp) ob1Var.a);
            default:
                return new ya1((Context) ob1Var.a);
        }
    }
}
