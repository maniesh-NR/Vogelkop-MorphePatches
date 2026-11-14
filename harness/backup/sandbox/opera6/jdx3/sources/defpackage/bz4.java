package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.media.FaceDetector;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.browser.chromium.ChromiumContent;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final /* synthetic */ class bz4 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bz4(ChromiumContent chromiumContent, lyg lygVar, dx3 dx3Var, ChromiumContent chromiumContent2, int i, int i2) {
        this.d = chromiumContent;
        this.f = lygVar;
        this.g = dx3Var;
        this.e = chromiumContent2;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ bz4(kn8 kn8Var, int i, int i2, Bitmap bitmap, Executor executor, n61 n61Var) {
        this.d = kn8Var;
        this.b = i;
        this.c = i2;
        this.e = bitmap;
        this.f = executor;
        this.g = n61Var;
    }

    public /* synthetic */ bz4(xqd xqdVar, nod nodVar, int i, npd npdVar, int i2, vqd vqdVar) {
        this.d = xqdVar;
        this.e = nodVar;
        this.b = i;
        this.f = npdVar;
        this.c = i2;
        this.g = vqdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        byte b = this.a;
        Object obj = this.g;
        final int i = this.c;
        Object obj2 = this.f;
        int i2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                lyg lygVar = (lyg) obj2;
                fp1 fp1Var = (dx3) obj;
                ChromiumContent chromiumContent = (ChromiumContent) obj3;
                GURL gurl = ChromiumContent.V;
                if (!((ChromiumContent) obj4).h()) {
                    l45 l45Var = new l45();
                    l45Var.a = new WeakReference(chromiumContent);
                    l45Var.b = fp1Var.getString(2132020554);
                    l45Var.c = t8.a.getString(2132018881);
                    lygVar.f(l45Var, new z8b(fp1Var), i2, i);
                    lygVar.g();
                    break;
                }
                break;
            case 1:
                Executor executor = (Executor) obj2;
                n61 n61Var = (n61) obj;
                int i3 = ((kn8) obj4).a;
                FaceDetector faceDetector = new FaceDetector(i2, i, i3);
                FaceDetector.Face[] faceArr = new FaceDetector.Face[i3];
                int iFindFaces = faceDetector.findFaces((Bitmap) obj3, faceArr);
                pn8[] pn8VarArr = new pn8[iFindFaces];
                for (int i4 = 0; i4 < iFindFaces; i4++) {
                    pn8VarArr[i4] = new pn8(0);
                    FaceDetector.Face face = faceArr[i4];
                    PointF pointF = new PointF();
                    face.getMidPoint(pointF);
                    float fEyesDistance = face.eyesDistance();
                    pn8VarArr[i4].b = new woh(0);
                    pn8 pn8Var = pn8VarArr[i4];
                    woh wohVar = pn8Var.b;
                    wohVar.b = pointF.x - fEyesDistance;
                    wohVar.c = pointF.y - fEyesDistance;
                    float f = fEyesDistance * 2.0f;
                    wohVar.d = f;
                    wohVar.e = f;
                    pn8Var.c = new pzb[0];
                }
                executor.execute(new cn7(n61Var, pn8VarArr, (byte) 18));
                break;
            default:
                final nod nodVar = (nod) obj3;
                final npd npdVar = (npd) obj2;
                final vqd vqdVar = (vqd) obj;
                vzk vzkVar = ((xqd) obj4).b;
                if (vzkVar.T(nodVar, i2)) {
                    kod kodVar = npdVar.e;
                    npdVar.r(nodVar);
                    kodVar.getClass();
                    if (i2 == 27) {
                        vqdVar.l(npdVar, nodVar, i);
                        vzkVar.k(nodVar, i2, new oqd());
                        break;
                    } else {
                        vzkVar.k(nodVar, i2, new vl5() { // from class: pqd
                            public final ListenableFuture run() {
                                return (ListenableFuture) vqdVar.l(npdVar, nodVar, i);
                            }
                        });
                        break;
                    }
                } else {
                    xqd.Y0(npdVar, nodVar, i, new e4j(-4));
                    break;
                }
        }
    }
}
