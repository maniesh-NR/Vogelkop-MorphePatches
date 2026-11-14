package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.internal.j;
import com.leanplum.internal.Constants;
import com.opera.api.Callback;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class xl extends ldk {
    public final /* synthetic */ byte j = 2;
    public Object k;
    public final Object l;
    public Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(Context context, umi umiVar) {
        super(umiVar);
        r16 r16Var = ngh.a;
        this.k = context.getApplicationContext();
        this.l = "ftouch_devs";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(i16 i16Var, Context context, umi umiVar, g16 g16Var) {
        super(umiVar);
        this.m = i16Var;
        r16 r16Var = ngh.a;
        this.k = w1h.l(context, umiVar, "cc_never", new bg1[0]);
        this.l = g16Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(umi umiVar, k32 k32Var, d4m d4mVar) {
        super(umiVar);
        r16 r16Var = ngh.a;
        this.k = new g4m(new ArrayList(), new ArrayList());
        nrl nrlVar = new nrl((byte) 26);
        this.l = nrlVar;
        this.m = k32Var;
        nrlVar.d(new npl(this, d4mVar, (byte) 10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(yl ylVar, Context context, umi umiVar) {
        super(umiVar);
        this.m = ylVar;
        r16 r16Var = ngh.a;
        this.k = context.getApplicationContext();
        this.l = z4c.b(new pa(this, (byte) 1));
    }

    @Override // defpackage.ldk
    public final Object a() throws Throwable {
        Throwable th;
        FileInputStream fileInputStreamOpenFileInput;
        byte b = this.j;
        FileInputStream fileInputStream = null;
        Object obj = this.l;
        int i = 0;
        switch (b) {
            case 0:
                zyk zykVar = (zyk) obj;
                try {
                    if (((File) zykVar.getValue()).exists()) {
                        qpb qpbVar = rpb.d;
                        String strC = x29.c((File) zykVar.getValue());
                        qpbVar.getClass();
                        return (List) qpbVar.a(strC, new k72(wl.Companion.serializer(), (byte) 0));
                    }
                } catch (IOException | oqb unused) {
                }
                return l08.a;
            case 1:
                String string = ((SharedPreferences) ((b59) this.k).get()).getString("set", null);
                if (string == null) {
                    return new HashSet();
                }
                try {
                    byte[] bArrB = ((c36) ((g16) obj).a.get()).b(Base64.decode(string, 0));
                    if (bArrB == null) {
                        return new HashSet();
                    }
                    String[] strArrSplit = new String(bArrB).split("\\|");
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    int length = strArrSplit.length;
                    while (i < length) {
                        hashSet.add(strArrSplit[i]);
                        i++;
                    }
                    return hashSet;
                } catch (IllegalArgumentException unused2) {
                    return new HashSet();
                }
            case 2:
                try {
                    try {
                        try {
                            fileInputStreamOpenFileInput = ((Context) this.k).openFileInput((String) obj);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (IOException | JSONException unused3) {
                        fileInputStreamOpenFileInput = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    JSONArray jSONArray = new JSONArray(xvg.z(fileInputStreamOpenFileInput));
                    ArrayList arrayList = new ArrayList(jSONArray.length());
                    while (i < jSONArray.length()) {
                        arrayList.add(new pwl(new orb(jSONArray.getJSONObject(i)), (byte) 1));
                        i++;
                    }
                    xvg.l(fileInputStreamOpenFileInput);
                    return arrayList;
                } catch (IOException | JSONException unused4) {
                    xvg.l(fileInputStreamOpenFileInput);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = fileInputStreamOpenFileInput;
                    xvg.l(fileInputStream);
                    throw th;
                }
            default:
                k32 k32Var = (k32) this.m;
                return new g4m((List) kfo.Y(((o3m) k32Var.get()).a, true, false, new qjl((byte) 10)), (List) kfo.Y(((o3m) k32Var.get()).a, true, false, new qjl((byte) 7)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // defpackage.ldk
    public final void b(Object obj) throws JSONException {
        byte b = this.j;
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        Object obj2 = this.l;
        byte b2 = 0;
        switch (b) {
            case 0:
                zyk zykVar = (zyk) obj2;
                List list = (List) obj;
                try {
                    if (list == null) {
                        ((File) zykVar.getValue()).delete();
                    } else {
                        File file = (File) zykVar.getValue();
                        qpb qpbVar = rpb.d;
                        qpbVar.getClass();
                        x29.d(file, qpbVar.b(list, new k72(wl.Companion.serializer(), (byte) 0)));
                    }
                    return;
                } catch (IOException unused) {
                    return;
                } catch (NullPointerException e) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (list != null) {
                        for (Object obj3 : list) {
                            ?? r5 = b2 + 1;
                            if (b2 < 0) {
                                j95.n();
                                throw null;
                            }
                            wl wlVar = (wl) obj3;
                            linkedHashMap.put(String.valueOf((int) b2), "pid: " + wlVar.b + " p: " + wlVar.c + " t: " + wlVar.d);
                            b2 = r5;
                        }
                    }
                    ks3.E(e, linkedHashMap);
                    ((File) zykVar.getValue()).delete();
                    return;
                }
            case 1:
                Set set = (Set) obj;
                b59 b59Var = (b59) this.k;
                if (set == null || set.isEmpty()) {
                    j.a((SharedPreferences) b59Var.get(), "set");
                    return;
                }
                ((SharedPreferences) b59Var.get()).edit().putString("set", Base64.encodeToString(((c36) ((g16) obj2).a.get()).d(TextUtils.join("|", set).getBytes()), 2)).apply();
                return;
            case 2:
                List<pwl> list2 = (List) obj;
                JSONArray jSONArray = new JSONArray();
                if (list2 != null) {
                    for (pwl pwlVar : list2) {
                        orb orbVar = new orb();
                        orbVar.p(pwlVar.a, "id");
                        orbVar.p(pwlVar.b, Constants.Kinds.DICTIONARY);
                        orbVar.p(pwlVar.c, Constants.Params.NAME);
                        orbVar.p(pwlVar.d, "version");
                        orbVar.p(pwlVar.e, "kind");
                        orbVar.p(Base64.encodeToString(pwlVar.f.getEncoded(), 2), "public_key");
                        orbVar.o(pwlVar.g.getTime(), "last_seen");
                        u1b u1bVar = pwlVar.h;
                        vpb vpbVar = new vpb();
                        Iterator it = u1bVar.iterator();
                        while (it.hasNext()) {
                            vpbVar.a((String) it.next());
                        }
                        orbVar.p(vpbVar, "capabilities");
                        jSONArray.put(orb.t(orbVar));
                    }
                }
                try {
                    fileOutputStreamOpenFileOutput = ((Context) this.k).openFileOutput((String) obj2, 0);
                    fileOutputStreamOpenFileOutput.write(jSONArray.toString().getBytes());
                    return;
                } finally {
                    xvg.l(fileOutputStreamOpenFileOutput);
                }
            default:
                g4m g4mVar = (g4m) obj;
                k32 k32Var = (k32) this.m;
                if (g4mVar != null) {
                    o3m o3mVar = (o3m) k32Var.get();
                    kfo.Y(o3mVar.a, false, true, new n3m(o3mVar, g4mVar.a, b2));
                    o3m o3mVar2 = (o3m) k32Var.get();
                    kfo.Y(o3mVar2.a, false, true, new n3m(o3mVar2, g4mVar.b, (byte) 1));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.ldk
    public final int c() {
        switch (this.j) {
            case 0:
                return 2;
            case 1:
            case 2:
            default:
                return 1;
        }
    }

    @Override // defpackage.ldk
    public final void d(Object obj) {
        switch (this.j) {
            case 0:
                List list = (List) obj;
                if (list != null) {
                    ((jec) ((yl) this.m).d).addAll(list);
                    break;
                }
                break;
            case 1:
                Object hashSet = (Set) obj;
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                ((i16) this.m).c = hashSet;
                break;
            case 2:
                List list2 = (List) obj;
                if (((List) this.m) == null) {
                    this.m = list2;
                    break;
                }
                break;
            default:
                g4m g4mVar = (g4m) obj;
                if (g4mVar != null) {
                    this.k = g4mVar;
                }
                ((nrl) this.l).K();
                break;
        }
    }

    public final void j(Callback callback) {
        ((nrl) this.l).d(new npl(this, callback, (byte) 11));
    }

    public final List k() {
        List list = (List) this.m;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        i();
        List list2 = (List) this.m;
        if (list2 == null) {
            list2 = Collections.EMPTY_LIST;
            this.m = list2;
        }
        return Collections.unmodifiableList(list2);
    }
}
