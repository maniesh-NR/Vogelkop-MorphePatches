package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.leanplum.core.BuildConfig;
import com.opera.android.browser.obml.MiniHttpClient$Call;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sne extends AsyncTask {
    public final Context a;
    public final String[] b;
    public String c = "";
    public final rma[] d;
    public final String[] e;

    public sne(String str, Context context) {
        this.a = context;
        String[] strArrSplit = str.split("\n");
        this.b = strArrSplit;
        int length = strArrSplit.length;
        this.d = new rma[length];
        this.e = new String[length];
    }

    public final void a(String str, int i, String str2, boolean z) {
        try {
            URI uri = new URI("probe:/send_result/" + i + "/" + str);
            HashMap map = new HashMap();
            map.put("X-Connection-Type", lcp.r);
            map.put("X-Signal-Quality", Integer.toString(lcp.q));
            map.put("X-DNS-Resolver-IP", this.c);
            map.put("X-Test-Type", Integer.toString(i));
            map.put("X-Probe-Failure", z ? "1" : BuildConfig.BUILD_NUMBER);
            g77 g77Var = new g77(uri, map, str2);
            hzd hzdVar = hzd.b;
            Objects.requireNonNull(hzdVar);
            new MiniHttpClient$Call(hzdVar, g77Var, null);
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            this.c = InetAddress.getByName("p" + (System.nanoTime() % 65537) + ".dnsecho.opera.com").getHostAddress();
        } catch (UnknownHostException unused) {
        }
        int i = 0;
        while (true) {
            rma[] rmaVarArr = this.d;
            if (i >= rmaVarArr.length) {
                return null;
            }
            try {
                rma rmaVarH = rma.h(this.a, this.b[i]);
                rmaVarArr[i] = rmaVarH;
                int i2 = 0;
                while (true) {
                    try {
                        int[] iArr = (int[]) rmaVarH.d;
                        if (i2 < iArr.length) {
                            iArr[i2] = rmaVarH.s();
                            i2++;
                        }
                    } catch (Exception e) {
                        rmaVarH.e = e.getMessage();
                    }
                }
            } catch (Exception e2) {
                this.e[i] = e2.getMessage();
            }
            publishProgress(Integer.valueOf(i));
            i++;
        }
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object[] objArr) {
        for (Integer num : (Integer[]) objArr) {
            int iIntValue = num.intValue();
            rma rmaVar = this.d[iIntValue];
            if (rmaVar != null) {
                int i = rmaVar.b;
                String str = (String) rmaVar.f;
                String string = (String) rmaVar.e;
                boolean z = string != null;
                int[] iArr = (int[]) rmaVar.d;
                if (string == null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        if (i2 > 0) {
                            sb.append(',');
                        }
                        sb.append(iArr[i2]);
                    }
                    string = sb.toString();
                }
                a(str, i, string, z);
            } else {
                String str2 = this.b[iIntValue];
                String str3 = this.e[iIntValue];
                if (!str2.startsWith("#")) {
                    try {
                        String[] strArrSplit = str2.split(";");
                        a(strArrSplit[0], Integer.parseInt(strArrSplit[3]), str3, true);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
