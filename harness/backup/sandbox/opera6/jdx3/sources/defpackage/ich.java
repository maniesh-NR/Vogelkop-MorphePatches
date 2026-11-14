package defpackage;

import android.content.SharedPreferences;
import android.util.SparseArray;
import com.opera.android.PushedContentHandler;
import com.opera.android.PushedContentHandler.Request;
import com.opera.android.browser.obml.Platform;

/* loaded from: classes.dex */
public final /* synthetic */ class ich implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PushedContentHandler b;

    public /* synthetic */ ich(PushedContentHandler pushedContentHandler, byte b) {
        this.a = b;
        this.b = pushedContentHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io7 io7Var;
        byte b = this.a;
        byte b2 = 1;
        PushedContentHandler pushedContentHandler = this.b;
        switch (b) {
            case 0:
                ich ichVar = new ich(pushedContentHandler, b2);
                avj avjVar = cak.d;
                avj.g(9, ichVar);
                break;
            default:
                b59 b59Var = pushedContentHandler.e;
                SparseArray sparseArray = pushedContentHandler.d;
                if (!pushedContentHandler.b) {
                    SharedPreferences sharedPreferences = (SharedPreferences) b59Var.get();
                    boolean z = !sharedPreferences.contains("version");
                    for (int i = 0; i < sparseArray.size(); i++) {
                        int iKeyAt = sparseArray.keyAt(i);
                        io7[] io7VarArrValues = io7.values();
                        int length = io7VarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                io7Var = io7VarArrValues[i2];
                                if (io7Var.a != iKeyAt) {
                                    i2++;
                                }
                            } else {
                                io7Var = null;
                            }
                        }
                        if (io7Var != null) {
                            int iC = pushedContentHandler.c(io7Var, (mch) sparseArray.valueAt(i));
                            if (z && iC != 0) {
                                sharedPreferences.edit().putInt("version", 2).apply();
                                cak.a(4);
                                z = false;
                            }
                        }
                    }
                    pushedContentHandler.b = true;
                }
                PushedContentHandler.Request request = pushedContentHandler.o;
                if ((request == null || request.d == 0) && !pushedContentHandler.c && ((SharedPreferences) b59Var.get()).getLong("timer", 0L) < System.currentTimeMillis()) {
                    Platform.f();
                    PushedContentHandler.Request request2 = pushedContentHandler.new Request();
                    pushedContentHandler.o = request2;
                    request2.a();
                    break;
                }
                break;
        }
    }
}
