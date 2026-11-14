package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.opera.android.OperaApplication;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ko7 extends ldk {
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko7(hd hdVar, umi umiVar) {
        super(umiVar);
        this.k = hdVar;
        r16 r16Var = ngh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko7(no7 no7Var, umi umiVar) {
        super(umiVar, true);
        this.k = no7Var;
        r16 r16Var = ngh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko7(s28 s28Var, umi umiVar) {
        super(umiVar);
        this.k = s28Var;
        r16 r16Var = ngh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko7(wun wunVar, umi umiVar) {
        super(umiVar);
        this.k = wunVar;
        r16 r16Var = ngh.a;
    }

    @Override // defpackage.ldk
    public final Object a() throws JSONException {
        izd izdVar;
        no7 no7Var;
        DataInputStream dataInputStream;
        int i = 0;
        izd izdVar2 = null;
        pkgVarA = null;
        DataInputStream dataInputStream2 = null;
        pkg pkgVarA = null;
        switch (this.j) {
            case 0:
                try {
                    no7 no7Var2 = (no7) this.k;
                    no7Var2.getClass();
                    int i2 = no7Var2.c;
                    String str = no7Var2.d;
                    FutureTask futureTask = pd6.a;
                    izdVar = new izd(new BufferedInputStream(new FileInputStream(pd6.a(i2, str))));
                    try {
                        ((no7) this.k).getClass();
                        no7Var = (no7) this.k;
                        no7Var.getClass();
                    } catch (Throwable unused) {
                        izdVar2 = izdVar;
                        try {
                            no7 no7Var3 = (no7) this.k;
                            no7Var3.g = 0;
                            no7Var3.i = no7Var3.h();
                            xvg.l(izdVar2);
                            no7 no7Var4 = (no7) this.k;
                            no7Var4.l(no7Var4.i);
                            return ((no7) this.k).i;
                        } catch (Throwable th) {
                            xvg.l(izdVar2);
                            no7 no7Var5 = (no7) this.k;
                            no7Var5.l(no7Var5.i);
                            throw th;
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (izdVar.readUnsignedByte() > 0) {
                    throw new IOException("");
                }
                int i3 = izdVar.readInt();
                Object objH = izdVar.readInt() <= 0 ? no7Var.h() : no7Var.k(izdVar);
                no7Var.g = i3;
                no7Var.i = objH;
                xvg.l(izdVar);
                no7 no7Var42 = (no7) this.k;
                no7Var42.l(no7Var42.i);
                return ((no7) this.k).i;
            case 1:
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(((Context) ((hd) this.k).c).openFileInput("media_play_queue.dat")));
                    try {
                        pkgVarA = pkg.a(dataInputStream);
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    dataInputStream = null;
                }
                xvg.l(dataInputStream);
                return pkgVarA;
            case 2:
                String string = ((SharedPreferences) ((s28) this.k).b.get()).getString("searches", "");
                if (!string.isEmpty()) {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        ArrayList arrayList = new ArrayList(jSONArray.length());
                        while (i < jSONArray.length()) {
                            Object obj = jSONArray.get(i);
                            if (obj == JSONObject.NULL) {
                                throw new JSONException(i + " is null");
                            }
                            arrayList.add(String.valueOf(obj));
                            i++;
                        }
                        return arrayList;
                    } catch (JSONException unused5) {
                    }
                }
                return Collections.EMPTY_LIST;
            default:
                Context context = ((wun) this.k).a;
                ArrayList arrayList2 = new ArrayList();
                try {
                    DataInputStream dataInputStream3 = new DataInputStream(new BufferedInputStream(context.openFileInput("webpage_meta_data.dat")));
                    try {
                        dataInputStream3.readInt();
                        int i4 = dataInputStream3.readInt();
                        while (i < i4) {
                            arrayList2.add(new lyf(dataInputStream3.readUTF(), tun.f(dataInputStream3)));
                            i++;
                        }
                        xvg.l(dataInputStream3);
                    } catch (Throwable unused6) {
                        dataInputStream2 = dataInputStream3;
                        xvg.l(dataInputStream2);
                        return arrayList2;
                    }
                } catch (Throwable unused7) {
                }
                return arrayList2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.DataOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.DataOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v7, types: [pkg] */
    @Override // defpackage.ldk
    public final void b(Object obj) throws Throwable {
        FileOutputStream fileOutputStream;
        ?? dataOutputStream;
        ?? dataOutputStream2;
        byte b = this.j;
        FileOutputStream fileOutputStream2 = null;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                byte[] bArr = (byte[]) obj;
                no7 no7Var = (no7) obj2;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    no7Var.getClass();
                    DataOutputStream dataOutputStream3 = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream3.writeByte(0);
                    dataOutputStream3.writeInt(no7Var.g);
                    if (bArr != null) {
                        dataOutputStream3.writeInt(bArr.length);
                        byteArrayOutputStream.write(bArr);
                    } else {
                        dataOutputStream3.writeInt(0);
                    }
                    no7Var.o();
                    int i = no7Var.c;
                    String str = no7Var.d;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        File fileA = pd6.a(i, str);
                        fileA.getParentFile().mkdirs();
                        fileOutputStream = new FileOutputStream(fileA);
                        try {
                            fileOutputStream.write(byteArray);
                        } catch (Throwable unused) {
                            fileOutputStream2 = fileOutputStream;
                            fileOutputStream = fileOutputStream2;
                            xvg.l(fileOutputStream);
                            return;
                        }
                    } catch (Throwable unused2) {
                    }
                    xvg.l(fileOutputStream);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 1:
                ?? r6 = (pkg) obj;
                if (r6 != 0) {
                    Context context = (Context) ((hd) obj2).c;
                    try {
                        try {
                            dataOutputStream = new DataOutputStream(new BufferedOutputStream(context.openFileOutput("media_play_queue.dat.tmp", 0)));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (FileNotFoundException unused4) {
                    } catch (IOException unused5) {
                    }
                    try {
                        r6.b(dataOutputStream);
                        dataOutputStream.close();
                        File fileStreamPath = context.getFileStreamPath("media_play_queue.dat.tmp");
                        if (fileStreamPath.renameTo(context.getFileStreamPath("media_play_queue.dat"))) {
                            return;
                        }
                        fileStreamPath.delete();
                        return;
                    } catch (FileNotFoundException unused6) {
                        fileOutputStream2 = dataOutputStream;
                        xvg.l(fileOutputStream2);
                        return;
                    } catch (IOException unused7) {
                        fileOutputStream2 = dataOutputStream;
                        context.getFileStreamPath("media_play_queue.dat.tmp").delete();
                        xvg.l(fileOutputStream2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = dataOutputStream;
                        xvg.l(fileOutputStream2);
                        throw th;
                    }
                }
                return;
            case 2:
                List list = (List) obj;
                if (list != null) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) ((s28) obj2).b.get()).edit();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(orb.t((String) it.next()));
                    }
                    editorEdit.putString("searches", jSONArray.toString()).apply();
                    return;
                }
                return;
            default:
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null) {
                    Context context2 = ((wun) obj2).a;
                    try {
                        try {
                            dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(context2.openFileOutput("webpage_meta_data.dat.tmp", 0)));
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (FileNotFoundException unused8) {
                    } catch (IOException unused9) {
                    }
                    try {
                        dataOutputStream2.write(bArr2);
                        dataOutputStream2.close();
                        File fileStreamPath2 = context2.getFileStreamPath("webpage_meta_data.dat.tmp");
                        if (fileStreamPath2.renameTo(context2.getFileStreamPath("webpage_meta_data.dat"))) {
                            return;
                        }
                        fileStreamPath2.delete();
                        return;
                    } catch (FileNotFoundException unused10) {
                        fileOutputStream2 = dataOutputStream2;
                        xvg.l(fileOutputStream2);
                        return;
                    } catch (IOException unused11) {
                        fileOutputStream2 = dataOutputStream2;
                        context2.getFileStreamPath("webpage_meta_data.dat.tmp").delete();
                        xvg.l(fileOutputStream2);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream2 = dataOutputStream2;
                        xvg.l(fileOutputStream2);
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // defpackage.ldk
    public final int c() {
        byte b = this.j;
        return 2;
    }

    @Override // defpackage.ldk
    public final void d(Object obj) {
        byte b = this.j;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                no7 no7Var = (no7) obj2;
                no7Var.f = true;
                no7Var.m(obj);
                i7f i7fVar = no7Var.e;
                g7f g7fVarC = u35.c(i7fVar, i7fVar);
                while (g7fVarC.hasNext()) {
                    ((mo7) g7fVarC.next()).o(true);
                }
                break;
            case 1:
                pkg pkgVar = (pkg) obj;
                hd hdVar = (hd) obj2;
                if (pkgVar != null) {
                    Context context = (Context) hdVar.c;
                    xbf xbfVar = (xbf) hdVar.d;
                    pjg pjgVar = new pjg(this, (byte) 2);
                    ArrayList arrayList = pkgVar.a;
                    String[] strArr = OperaApplication.K;
                    rf7 rf7Var = ((OperaApplication) context.getApplicationContext()).m().a;
                    int i = pkgVar.b;
                    dgd dgdVar = (i < 0 || i >= arrayList.size()) ? null : (dgd) arrayList.get(pkgVar.b);
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    int i2 = 0;
                    egd egdVar = null;
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        dgd dgdVar2 = (dgd) obj3;
                        long j = dgdVar2.a;
                        re7 re7VarD = j != 0 ? rf7Var.d(j) : null;
                        String str = dgdVar2.b;
                        Uri uri = str != null ? Uri.parse(str) : null;
                        egd egdVar2 = (re7VarD == null && uri == null) ? null : new egd(re7VarD, uri, dgdVar2.c, dgdVar2.d, Integer.MIN_VALUE);
                        if (egdVar2 != null) {
                            if (dgdVar2 == dgdVar) {
                                egdVar = egdVar2;
                            }
                            arrayList2.add(egdVar2);
                        }
                    }
                    tjg tjgVar = (tjg) xbfVar.b;
                    egd[] egdVarArr = (egd[]) arrayList2.toArray(new egd[0]);
                    long j2 = pkgVar.c;
                    if (tjgVar.o != null) {
                        tjgVar.e(egdVarArr, new yx((Object) tjgVar, (Object) egdVar, j2, (Object) pjgVar, (byte) 5));
                        break;
                    }
                } else {
                    hdVar.b = true;
                    ((we7) hdVar.g).a((xbf) hdVar.d);
                    break;
                }
                break;
            case 2:
                List list = (List) obj;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((l76) ((s28) obj2).e).addLast((String) it.next());
                    }
                    break;
                }
                break;
            default:
                List<lyf> list2 = (List) obj;
                if (list2 != null) {
                    for (lyf lyfVar : list2) {
                        ((wun) obj2).c.put((String) lyfVar.a, (tun) lyfVar.b);
                    }
                    break;
                }
                break;
        }
    }
}
