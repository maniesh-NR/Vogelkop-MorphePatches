package defpackage;

import J.N;
import android.net.Uri;
import android.os.SystemClock;
import com.leanplum.internal.Constants;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final /* synthetic */ class az4 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ az4(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        ge5 ge5Var;
        byte b = this.a;
        long j = this.b;
        Object obj2 = this.c;
        int i = 0;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                GURL gurl = ChromiumContent.V;
                N.MYhVVL5A(((ChromiumContent) obj2).n, (String) obj, j);
                break;
            case 1:
                rma rmaVar = (rma) obj2;
                ze9 ze9Var = (ze9) obj;
                cd9 cd9Var = (cd9) rmaVar.f;
                if (rmaVar.b == 1) {
                    rmaVar.b = 0;
                    rmaVar.i = null;
                    if (ze9Var != null) {
                        long jUptimeMillis = (j + ze9Var.b) - SystemClock.uptimeMillis();
                        Uri.Builder builderAppendQueryParameter = Uri.parse("https://opera.com/connect").buildUpon().appendQueryParameter("id", ze9Var.a);
                        builderAppendQueryParameter.appendQueryParameter(Constants.Params.TYPE, "sync");
                        cd9Var.C0(builderAppendQueryParameter.build().toString());
                        ((q65) rmaVar.g).B0((umi) rmaVar.e, Math.max(jUptimeMillis, 30000L), TimeUnit.MILLISECONDS);
                        bf9 bf9Var = (bf9) rmaVar.d;
                        zc9 zc9Var = new zc9(rmaVar, objArr == true ? 1 : 0);
                        if (bf9Var.r() < 1 || bf9Var.n != null) {
                            zc9Var.run(null);
                            ge5Var = bf9.A;
                        } else {
                            bf9Var.u.add(zc9Var);
                            if (!bf9Var.v) {
                                bf9Var.v = true;
                                vml.d(new we9(bf9Var, (byte) 0), 10000L);
                            }
                            ge5Var = new ge5(bf9Var, zc9Var, (byte) 23);
                        }
                        rmaVar.b = 2;
                        rmaVar.i = ge5Var;
                        break;
                    } else {
                        cd9Var.A0(1);
                        break;
                    }
                }
                break;
            default:
                v8f v8fVar = (v8f) obj2;
                ilh ilhVar = (ilh) obj;
                ArrayList arrayList = v8fVar.c;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        if (((ilh) obj3).a != j) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i != -1) {
                    arrayList.set(i, ilhVar);
                    v8fVar.b.r(arrayList);
                    break;
                }
                break;
        }
    }
}
