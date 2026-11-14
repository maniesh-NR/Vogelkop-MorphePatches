package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class bw6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ bw6(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        byte b = this.a;
        int i = 0;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                an9.a(4, arrayList);
                break;
            case 1:
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    new File(((Uri) obj).getPath()).delete();
                }
                break;
            case 2:
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((l6e) obj2).q();
                }
                break;
            default:
                int size3 = arrayList.size();
                int i2 = 0;
                while (i2 < size3) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    ((ExecutorService) obj3).shutdownNow();
                }
                int size4 = arrayList.size();
                while (i < size4) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    ((ExecutorService) obj4).awaitTermination(1L, TimeUnit.SECONDS);
                }
                break;
        }
    }
}
