package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import com.opera.android.Lazy;
import com.opera.api.Callback;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class w8d implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w8d(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w8d(a9d a9dVar, int i) {
        this.a = (byte) 0;
        this.c = a9dVar;
        this.b = i;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        byte b2 = 0;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a9d a9dVar = (a9d) obj2;
                ylk ylkVar = (ylk) obj;
                Object obj3 = ylkVar.a;
                int iOrdinal = ((emk) ylkVar.b).ordinal();
                if (iOrdinal == 0) {
                    break;
                } else if (iOrdinal == 1) {
                    z77 z77Var = a9dVar.i;
                    tim timVar = new tim(new h8d(a9dVar, a9dVar.f, a9dVar.l, this.b ? 1 : 0, a9dVar.Q()));
                    z77Var.getClass();
                    z77Var.b(timVar, ijm.b);
                    break;
                } else if (iOrdinal == 2) {
                    break;
                }
                break;
            case 1:
                xbf xbfVar = (xbf) obj2;
                c3g c3gVar = (c3g) obj;
                xbfVar.getClass();
                long j = c3gVar != null ? c3gVar.a : 0L;
                x79 x79Var = (x79) xbfVar.c;
                if (((x79) x79Var.e) == null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (z && jCurrentTimeMillis - j > 72000000) {
                        x79Var.e = new x79((kw0) x79Var.c);
                        r2g r2gVar = new r2g(x79Var, xbfVar, (byte) 0);
                        String str = (String) ((Lazy) ((qie) x79Var.a).b).f();
                        String[] strArr = aik.a;
                        if (str == null) {
                            str = "";
                        }
                        if (!str.isEmpty()) {
                            ((e00) x79Var.b).a(new s2g(x79Var, r2gVar, str, b2));
                            break;
                        } else {
                            r2gVar.run(null);
                            break;
                        }
                    }
                }
                break;
            case 2:
                final iji ijiVar = (iji) obj2;
                if (((Boolean) obj).booleanValue()) {
                    final boolean z2 = ijiVar.v;
                    if (z2) {
                        ijiVar.l(true);
                    }
                    if (ijiVar.Z()) {
                        final String strP = ijiVar.p();
                        final Uri uri = ijiVar.p;
                        final umi umiVar = vml.d;
                        boolean zEquals = Objects.equals(uri.getScheme(), "file");
                        final boolean z3 = this.b;
                        if (!zEquals) {
                            umiVar.e(new yii(uri, (byte) 0)).c(new n5o() { // from class: zii
                                public final Object g(Object obj4) {
                                    Map map = (Map) obj4;
                                    String str2 = strP;
                                    boolean zContainsKey = map.containsKey(str2);
                                    iji ijiVar2 = ijiVar;
                                    Uri uri2 = uri;
                                    boolean z4 = z2;
                                    if (zContainsKey) {
                                        if (!z3) {
                                            ijiVar2.P();
                                            return null;
                                        }
                                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri2, (String) map.get(str2));
                                        fji fjiVarQ = ijiVar2.q(uriBuildDocumentUriUsingTree);
                                        if (fjiVarQ == null || ijiVar2.e.equals(fjiVarQ)) {
                                            umiVar.e(new yii(uriBuildDocumentUriUsingTree, (byte) 1)).c(new is6((Object) ijiVar2, (Object) uri2, (Object) str2, z4, (byte) 2)).a(ijiVar2.b.getContext().getContentResolver(), null);
                                            return null;
                                        }
                                        ijiVar2.k(fjiVarQ, new wii(ijiVar2, (byte) 1));
                                    }
                                    ijiVar2.s(new gg7(ijiVar2, uri2, str2, z4, (byte) 4));
                                    return null;
                                }
                            }).a(ijiVar.b.getContext().getContentResolver(), null);
                            break;
                        } else {
                            final File file = new File(uri.getPath(), strP);
                            final fji fjiVarQ = ijiVar.q(uri.buildUpon().appendPath(strP).build());
                            final fji fjiVar = ijiVar.e;
                            umiVar.e(new n5o() { // from class: xii
                                public final Object g(Object obj4) {
                                    File file2 = file;
                                    boolean zExists = file2.exists();
                                    String str2 = strP;
                                    if (zExists) {
                                        if (!z3) {
                                            return null;
                                        }
                                        fji fjiVar2 = fjiVarQ;
                                        if ((fjiVar2 == null || fjiVar.equals(fjiVar2)) && !file2.delete()) {
                                            return lg7.d(ijiVar.b.getContext(), uri, str2);
                                        }
                                    }
                                    return str2;
                                }
                            }).c(new nrd(ijiVar, fjiVarQ, fjiVar, uri, z2)).a(null, null);
                            break;
                        }
                    }
                }
                break;
            default:
                bf9 bf9Var = (bf9) obj2;
                List list = (List) obj;
                bf9Var.o = null;
                if (!bf9Var.v(list)) {
                    if (z) {
                        we9 we9Var = new we9(bf9Var, (byte) 4);
                        ssi ssiVar = new ssi();
                        ssiVar.b = we9Var;
                        vml.d(ssiVar, 2000L);
                        bf9Var.o = ssiVar;
                        break;
                    }
                } else {
                    bf9Var.J(list);
                    break;
                }
                break;
        }
    }
}
