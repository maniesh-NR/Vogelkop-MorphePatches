package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Trace;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.opera.android.favorites.g;
import com.opera.hype.image.editor.TextBoxEditText;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public final /* synthetic */ class ge5 implements ee5, es5, ls5, n5o, gjc, fjc, fn8, auk, yjj, OnCompleteListener, nl5, mr8, zt8, ih4, tam, OnFailureListener, qnb, p9n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ge5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ge5(Object obj, String str, byte b) {
        this.a = b;
        this.c = obj;
        this.b = str;
    }

    public final void a(Uri uri, String str) {
        ((wcj) this.b).c(((View) this.c).getContext(), new i4d(new vvf(uri, str, (byte) 19)));
    }

    public final void b(int i) {
        mlf mlfVar = (mlf) this.b;
        nl5 nl5Var = (nl5) this.c;
        mlfVar.e = null;
        nl5Var.b(i);
    }

    public final i c(ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 15:
                return new hu7(ov0.i(LayoutInflater.from(viewGroup.getContext()), viewGroup), (x77) obj2, (jv3) obj);
            default:
                return new ou7(ov0.i(LayoutInflater.from(viewGroup.getContext()), viewGroup), (ua7) obj2, (jv3) obj);
        }
    }

    public final void cancel() {
        bf9 bf9Var = (bf9) this.b;
        bf9Var.u.remove((zc9) this.c);
    }

    public final cn8[] createExtractors() {
        ut6 ut6Var = (ut6) this.b;
        oj9 oj9Var = (oj9) this.c;
        return new cn8[]{ut6Var.c.b(oj9Var) ? new qnk(ut6Var.c.k(oj9Var), null) : new tt6(oj9Var)};
    }

    public final boolean d(hq8 hq8Var) {
        nr8 nr8Var = (nr8) this.c;
        String str = (String) this.b;
        nr8Var.getClass();
        if (hq8Var instanceof g) {
            return false;
        }
        return (TextUtils.isEmpty(str) || hq8Var == null || !wqm.J(str, hq8Var.i(p6l.a), true, false)) ? false : true;
    }

    public final void e(int i, int i2, byte[] bArr, int i3, int i4) {
        String strEncodeToString;
        byte b = this.a;
        Uri uriBuild = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                g1j g1jVar = (g1j) obj;
                String str = (String) obj2;
                if (bArr != null && bArr.length > 0) {
                    try {
                        String strReplace = "image/png".replace(",", "%44");
                        if (bArr.length <= 256) {
                            for (byte b2 : bArr) {
                                if ((b2 & 128) != 0) {
                                    strReplace = strReplace + ";base64";
                                    strEncodeToString = Base64.encodeToString(bArr, 2);
                                    uriBuild = new Uri.Builder().scheme("data").encodedOpaquePart(strReplace + "," + strEncodeToString).build();
                                }
                            }
                            strEncodeToString = Uri.encode(new String(bArr, StandardCharsets.UTF_8));
                            uriBuild = new Uri.Builder().scheme("data").encodedOpaquePart(strReplace + "," + strEncodeToString).build();
                        } else {
                            strReplace = strReplace + ";base64";
                            strEncodeToString = Base64.encodeToString(bArr, 2);
                            uriBuild = new Uri.Builder().scheme("data").encodedOpaquePart(strReplace + "," + strEncodeToString).build();
                        }
                    } catch (OutOfMemoryError unused) {
                    }
                    if (uriBuild != null) {
                        g1jVar.n(uriBuild.toString(), str);
                        break;
                    }
                }
                break;
            default:
                at5 at5Var = (at5) obj2;
                eri eriVar = (eri) obj;
                qs5 qs5Var = at5Var.d;
                if (bArr == null || bArr.length <= 0) {
                    at5Var.j.R(21, (String) null);
                    break;
                } else {
                    Size size = new Size(i3, i4);
                    new Size(i, i2);
                    lsc lscVarG = eriVar.g(bArr, size, new Size(qs5Var.q, qs5Var.r), qs5Var.e);
                    vx3 vx3Var = new vx3(lqm.d);
                    vx3Var.p.add(new xx3(lscVarG));
                    at5Var.l(vx3Var, false, true);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.n5o
    public final Object g(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 9:
                rv0 rv0Var = ((vk6) obj3).a;
                break;
            case 14:
                ((re7) obj3).x((String) obj);
                ((bu3) obj2).run();
                break;
            default:
                qc9 qc9Var = (qc9) obj2;
                List list = (List) obj;
                if (((pc9) obj3).f.remove(qc9Var)) {
                    qc9Var.a(0, list);
                    break;
                }
                break;
        }
        return null;
    }

    public final void h(View view) {
        ArrayList arrayList = (ArrayList) this.b;
        View view2 = (View) this.c;
        if (view instanceof pvb) {
            pvb pvbVar = (pvb) view;
            if (pvbVar.j()) {
                arrayList.add(new qvb(view2, pvbVar));
            }
        }
    }

    public final Object i(cue cueVar, boolean z) {
        au8 au8Var = (au8) this.b;
        zqe zqeVar = (bwf) this.c;
        HashMap map = au8Var.c;
        if (cueVar == cue.b) {
            return new e92(au8Var, null, "dummy");
        }
        List listAsList = Arrays.asList(zqeVar, cueVar, Boolean.valueOf(z));
        f92 f92Var = (f92) map.get(listAsList);
        if (f92Var != null) {
            return f92Var;
        }
        xue xueVar = (xue) au8Var.b.get(cueVar);
        if (xueVar == null) {
            bxl.l(cueVar, "Unsupported news source: ");
            return null;
        }
        uqe uqeVarC = xueVar.a.c();
        zue zueVar = z ? new zue(au8Var, uqeVarC) : new zue(au8Var, uqeVarC, zqeVar.a);
        map.put(listAsList, zueVar);
        return zueVar;
    }

    public final void invoke(Object obj) {
        d11 d11Var = (d11) this.b;
        tjd tjdVar = (tjd) this.c;
        dkd dkdVar = (dkd) ((e11) obj);
        dkdVar.getClass();
        jrd jrdVar = d11Var.d;
        if (jrdVar != null) {
            oj9 oj9Var = tjdVar.c;
            oj9Var.getClass();
            int i = tjdVar.d;
            ju6 ju6Var = dkdVar.c;
            gql gqlVar = d11Var.b;
            jrdVar.getClass();
            ro9 ro9Var = new ro9((Object) oj9Var, i, (Object) ju6Var.c(gqlVar, jrdVar), (byte) 18);
            int i2 = tjdVar.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    dkdVar.q = ro9Var;
                    return;
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    dkdVar.r = ro9Var;
                    return;
                }
            }
            dkdVar.p = ro9Var;
        }
    }

    @Override // defpackage.auk
    public final void j(yo2 yo2Var) {
        ow6 ow6Var = (ow6) this.b;
        os9 os9Var = (((buk) this.c).c.a() && yo2Var.d) ? os9.c : os9.b;
        lgf lgfVar = ow6Var.a;
        rs9.d((AtomicBoolean) lgfVar.b, true);
        rs9.c((Thread) lgfVar.d);
        if (((os9) lgfVar.m) != os9Var) {
            lgfVar.m = os9Var;
            lgfVar.l(lgfVar.a);
        }
    }

    public final uam k(TextBoxEditText textBoxEditText) {
        ywa ywaVar = (ywa) this.b;
        ddc ddcVar = (ddc) this.c;
        xtb[] xtbVarArr = ywa.g;
        return new w7j(textBoxEditText, ywaVar.g0().h, ddcVar);
    }

    public final SecretKey l() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        SecretKey secretKeyGenerateKey;
        z26 z26Var = (z26) this.b;
        y26 y26Var = (y26) this.c;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.clear();
        calendar2.add(1, 100);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", z26Var.a.getProvider());
        for (int i = 0; i < 3; i++) {
            try {
                keyGenerator.init(new KeyGenParameterSpec.Builder(y26Var.a, 3).setKeySize(c36.c[i]).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).setRandomizedEncryptionRequired(true).build());
                secretKeyGenerateKey = keyGenerator.generateKey();
            } catch (NullPointerException | InvalidAlgorithmParameterException | ProviderException unused) {
            }
            if (secretKeyGenerateKey != null) {
                return secretKeyGenerateKey;
            }
        }
        return null;
    }

    public final void n(String str) {
        String mimeTypeFromExtension;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                ((ge5) obj2).n(str);
                ((ge5) obj).n(str);
                break;
            default:
                at5 at5Var = (at5) obj2;
                ImageView imageView = (ImageView) obj;
                if (str != null && (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str)) != null) {
                    rmh rmhVarA = rmh.a(imageView);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType(mimeTypeFromExtension);
                    b2l b2lVar = at5Var.g;
                    xs5 xs5Var = new xs5(at5Var, imageView, (byte) 1);
                    zcj zcjVar = rmhVarA.a;
                    p1j p1jVar = rmhVarA.b;
                    if (p1jVar != null) {
                        p1jVar.cancel(false);
                    }
                    ArrayList arrayListC = zcjVar.c(intent, b2lVar);
                    eof eofVar = new eof(rmhVarA, arrayListC, xs5Var);
                    HashMap mapD = zcj.d(arrayListC);
                    qie qieVar = zcjVar.c;
                    umi umiVar = zcjVar.b;
                    nml nmlVarB = umiVar.b(new ycj(zcjVar, intent, mapD, (byte) 1));
                    nmlVarB.b(umiVar.f(new txi(eofVar, (byte) 3)));
                    rmhVarA.b = qieVar.n(new oml(nmlVarB), (Object) null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gjc
    public final void o(Object obj, w69 w69Var) {
        dkd dkdVar = (dkd) ((e11) obj);
        dkdVar.k((qi8) this.c, new k5o(w69Var, ((el6) this.b).e));
    }

    public final void onComplete(Task task) {
        ((v38) this.b).a((Intent) this.c);
    }

    public final void onFailure(Exception exc) {
        mab mabVar = (mab) this.b;
        ((x5f) this.c).R(4, "Install fail: " + exc.getMessage());
        if (((qdc) mabVar.getLifecycle()).i.d(qcc.c)) {
            mabVar.requireActivity().J();
        }
    }

    public final void p(String str, byte[] bArr) {
        String mimeTypeFromExtension;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                d5o d5oVar = (d5o) obj2;
                es5 es5Var = (es5) obj;
                if (bArr != null && str != null && (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str)) != null) {
                    new ldj((Context) d5oVar.a, ".".concat(str), bArr, new wx(es5Var, mimeTypeFromExtension, (byte) 29)).execute(new Void[0]);
                    break;
                }
                break;
            default:
                ((ge5) obj2).p(str, bArr);
                ((ge5) obj).p(str, bArr);
                break;
        }
    }

    public final Object r(x79 x79Var) {
        String str = (String) this.b;
        kd5 kd5Var = (kd5) this.c;
        try {
            Trace.beginSection(str);
            return kd5Var.f.r(x79Var);
        } finally {
            Trace.endSection();
        }
    }

    public final void run() throws IOException {
        int i;
        pnb pnbVar = (pnb) this.b;
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        ReadableByteChannel readableByteChannel = pnbVar.n;
        if (readableByteChannel != null) {
            pnbVar.w++;
            i = readableByteChannel.read(byteBuffer);
        } else {
            i = -1;
        }
        mnb mnbVar = pnbVar.a;
        if (i != -1) {
            qqm qqmVar = pnbVar.o;
            mnbVar.getClass();
            mnbVar.b(new a32(mnbVar, qqmVar, byteBuffer, (byte) 16), "onReadCompleted");
            return;
        }
        ReadableByteChannel readableByteChannel2 = pnbVar.n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (pnbVar.f.compareAndSet(5, 7)) {
            pnbVar.c("fireDisconnect", new inb(pnbVar, (byte) 2));
            qqm qqmVar2 = pnbVar.o;
            mnbVar.getClass();
            mnbVar.c("onSucceeded", new lnb(mnbVar, qqmVar2, (byte) 1));
        }
    }
}
