package defpackage;

import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.settings.SettingsManager;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.api.Callback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.text.Regex;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class jl4 implements x9n, fjc, xo4, p9g, n5o, vlf, kjm, av4, i6f, m94, q5n, h93, nl5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ jl4(xm5 xm5Var, hkf hkfVar) {
        this.a = (byte) 23;
        this.b = hkfVar;
    }

    @Override // defpackage.av4
    public final void E(CheckBox checkBox) {
        ql5 ql5Var = (ql5) this.b;
        ql5Var.e.V(!checkBox.n ? 1 : 0, "show_conflicting_settings_warning");
    }

    @Override // defpackage.x9n
    public final void a(int i) {
        kl4 kl4Var = (kl4) this.b;
        kl4Var.g = i;
        Suggestion suggestion = kl4Var.f;
        if (suggestion == null || i != 100) {
            return;
        }
        kl4Var.e.D(suggestion);
    }

    public final Object attachCompleter(l94 l94Var) {
        ((xob) this.b).s(new wg5(l94Var, (byte) 6));
        return "Job.asListenableFuture";
    }

    @Override // defpackage.nl5
    public final void b(int i) {
        tc6 tc6Var = (tc6) this.b;
        if (i == 1) {
            x5f x5fVar = (x5f) tc6Var.w;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                am2.f(zpaVar, x56VarF).b.p(9, 1, 1L);
                x5fVar.U0(x56VarF);
            }
            xi5 xi5Var = tc6Var.x;
            xi5Var.c.d();
            xi5Var.h(0L, 0L);
            tc6Var.H0();
        }
    }

    public final up4 c(vzk vzkVar) {
        String str;
        vp4 vp4Var = (vp4) this.b;
        URL url = (URL) vzkVar.a;
        if (Log.isLoggable("TRuntime.CctTransportBackend", 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(RequestBuilder.POST);
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/5.0.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str2 = (String) vzkVar.c;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("Cookie", "NID=".concat(str2));
        }
        String str3 = (String) vzkVar.d;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str3);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    eq6 eq6Var = vp4Var.a;
                    tm2 tm2Var = (tm2) vzkVar.b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    mqb mqbVar = (mqb) eq6Var.a;
                    ysb ysbVar = new ysb(bufferedWriter, mqbVar.a, mqbVar.b, mqbVar.c, mqbVar.d);
                    ysbVar.a(tm2Var);
                    ysbVar.c();
                    ysbVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.CctTransportBackend", 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    mkh.q(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    mkh.q(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new up4(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L, null);
                    }
                    if (responseCode != 200) {
                        return new up4(responseCode, null, 0L, null);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            long j = ao2.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a;
                            String headerField = httpURLConnection.getHeaderField("Set-Cookie");
                            if (headerField != null) {
                                for (String str4 : headerField.split(";")) {
                                    String[] strArrSplit = str4.trim().split("=", 2);
                                    if (strArrSplit.length == 2) {
                                        String str5 = strArrSplit[0];
                                        str = strArrSplit[1];
                                        if (str5.equals("NID")) {
                                            break;
                                        }
                                    }
                                }
                                str = null;
                            } else {
                                str = null;
                            }
                            up4 up4Var = new up4(responseCode, null, j, str);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return up4Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (q28 | IOException unused) {
            mkh.v("CctTransportBackend");
            return new up4(400, null, 0L, null);
        } catch (ConnectException | UnknownHostException unused2) {
            mkh.v("CctTransportBackend");
            return new up4(500, null, 0L, null);
        }
    }

    public final Object e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 19:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    u0h u0hVar = yqh.a;
                    h9o.s("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + yqh.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    h9o.s("Failed to invoke constructor '" + yqh.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return anm.a.a(cls);
                } catch (Exception e4) {
                    h9o.s(fki.q(cls, "Unable to create instance of ", ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e4);
                    return null;
                }
        }
    }

    public final Object g(Object obj) {
        byte b = this.a;
        int i = 0;
        Object obj2 = this.b;
        switch (b) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ArrayList arrayList = ((t25) obj2).g;
                int size = arrayList.size();
                long j = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    re7 re7Var = (re7) obj3;
                    dd7 dd7VarE = re7Var.e();
                    j += dd7VarE == null ? re7Var.j : dd7VarE.j();
                }
                return Long.valueOf(j);
            case SizeUtil.textSize1 /* 22 */:
                wz5 wz5Var = (wz5) obj2;
                wz5Var.setResult(-1, (Intent) obj);
                wz5Var.finish();
                return Unit.a;
            case 25:
                File file = (File) obj2;
                StringBuilder sb = new StringBuilder(sko.k("Contents of ", file.getAbsolutePath(), "\n"));
                fsp.d(sb, file, 0, false);
                sb.append("\nLargest folders:\n");
                for (Pair pair : y1j.f(new ec7(new m2m(y1j.c(y29.f(file, FileWalkDirection.a), new wx1(file, (byte) 4)), new tb6((byte) 1)), new yg9((byte) 25), (byte) 2), 50)) {
                    File file2 = (File) pair.a;
                    long jLongValue = ((Number) pair.b).longValue();
                    sb.append(new File(z29.k(file2, file)).getPath() + "/ (" + jLongValue + " bytes)\n");
                }
                return sb.toString();
            case 28:
                tn tnVar = (tn) obj2;
                String str = (String) obj;
                try {
                    t9f t9fVar = (t9f) xne.b.get();
                    fvh fvhVar = new fvh();
                    fvhVar.a = (hra) tnVar.c;
                    Regex regex = esd.e;
                    fvhVar.e(RequestBuilder.POST, rvh.create(str, wyh.x("application/json")));
                    boolean z = t9fVar.c(new kvh(fvhVar)).execute().q;
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            default:
                vk6 vk6Var = (vk6) obj2;
                List list = (List) kfo.Y(vk6Var.a.a, true, false, new y2((byte) 18));
                kfo.Y(vk6Var.a.a, false, true, new y2((byte) 17));
                return list;
        }
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                ((eig) obj).F((zh8) obj2);
                break;
            case 2:
                ((eig) obj).G((fzl) ((pyl) obj2).e);
                break;
            case 3:
                ((eig) obj).G((fzl) obj2);
                break;
            default:
                ((eig) obj).K((rb3) obj2, 1);
                break;
        }
    }

    public final void k(int[] iArr, String[] strArr) {
        z0c z0cVar = (z0c) this.b;
        ((Callback) z0cVar.b).run(Boolean.valueOf(yi4.y((sz4) z0cVar.c)));
    }

    @Override // defpackage.xo4
    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                return remoteMediaClient.setActiveMediaTracks((long[]) obj);
            default:
                return remoteMediaClient.queueInsertItems((MediaQueueItem[]) obj, 0, (JSONObject) null);
        }
    }

    @Override // defpackage.kjm
    public final void o(jjm jjmVar, hjm hjmVar) {
        xg5 xg5Var = (xg5) this.b;
        if (jjmVar == xg5Var.b) {
            xg5Var.b = null;
            ((t0g) xg5Var.a.b).setValue((Object) null);
            if (xg5Var.d) {
                return;
            }
            mim mimVar = xg5Var.c;
            xg5Var.c = null;
            if (mimVar != null) {
                mimVar.run();
            }
        }
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        int iOrdinal = ((hkf) this.b).ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                h9o.p();
                return false;
            }
            i = 6;
        }
        return c37.r().l(i, keyEvent);
    }

    @Override // defpackage.h93
    public final void s() {
        BrowserActivity browserActivityO = q9n.o(((sb6) this.b).requireContext());
        d8j d8jVar = browserActivityO != null ? (d8j) browserActivityO.g0.E(d8j.class) : null;
        if (d8jVar != null) {
            ((g8j) d8jVar).h();
        }
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                ((e35) obj).z.d();
                break;
            case 12:
            default:
                ((SettingsManager) ((igi) obj).d).V(z ? 1 : 0, "compression");
                break;
            case 13:
                p35 p35Var = (p35) obj;
                p35Var.v.V(z ? 1 : 0, "exit_dialog_enabled");
                p35Var.G0();
                break;
        }
    }
}
