package defpackage;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class ctc extends zsc {
    public final ndc a;
    public final btc b;

    public ctc(ndc ndcVar, v7n v7nVar) {
        this.a = ndcVar;
        plk plkVar = new plk(v7nVar, btc.d, e06.b);
        s15 s15VarA = uqh.a(btc.class);
        String strB = s15VarA.b();
        if (strB != null) {
            this.b = (btc) plkVar.n(s15VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        } else {
            qp2.o("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public static boolean c(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        fxj fxjVar = this.b.b;
        if (fxjVar.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < fxjVar.c; i++) {
                atc atcVar = (atc) fxjVar.f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(fxjVar.a[i]);
                printWriter.print(": ");
                printWriter.println(atcVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                wsc wscVar = atcVar.l;
                printWriter.println(wscVar);
                wscVar.dump(str2.concat("  "), fileDescriptor, printWriter, strArr);
                if (atcVar.n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(atcVar.n);
                    q59 q59Var = atcVar.n;
                    String strConcat = str2.concat("  ");
                    q59Var.getClass();
                    printWriter.print(strConcat);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(q59Var.b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(wscVar.dataToString(atcVar.g()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(atcVar.h());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ndc ndcVar = this.a;
        sb.append(ndcVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(ndcVar)));
        sb.append("}}");
        return sb.toString();
    }
}
