package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class dln implements f94, gln {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ gln b;
    public final /* synthetic */ vq8 c;

    public dln(vq8 vq8Var, gln glnVar, boolean z) {
        this.b = glnVar;
        this.a = z;
        this.c = vq8Var;
    }

    public dln(vq8 vq8Var, boolean z, gln glnVar) {
        this.a = z;
        this.b = glnVar;
        Objects.requireNonNull(vq8Var);
        this.c = vq8Var;
    }

    @Override // defpackage.gln
    public final void e(ArrayList arrayList) {
        if (this.a) {
            ((kze) this.c.j).r(arrayList);
        }
        this.b.e(arrayList);
    }

    @Override // defpackage.gln
    public final void onFailure() {
        this.b.onFailure();
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        umi umiVar = (umi) this.c.g;
        gln glnVar = this.b;
        Objects.requireNonNull(glnVar);
        umiVar.d(new y1n((Object) glnVar, (byte) 23)).a(null);
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        vq8 vq8Var = this.c;
        umi umiVar = (umi) vq8Var.g;
        boolean z = pzhVar.q;
        byte b = 23;
        gln glnVar = this.b;
        if (!z) {
            pzhVar.close();
            Objects.requireNonNull(glnVar);
            umiVar.d(new y1n(glnVar, b)).a(null);
            return;
        }
        try {
            vzh vzhVar = pzhVar.g;
            try {
                String strString = vzhVar.string();
                vml.c(new npl(glnVar, vq8.j(strString), (byte) 25));
                if (this.a) {
                    File file = (File) vq8Var.f;
                    File file2 = (File) vq8Var.b;
                    try {
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        s29.j(file, strString.getBytes(StandardCharsets.UTF_8));
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
                vzhVar.close();
            } catch (Throwable th) {
                if (vzhVar != null) {
                    try {
                        vzhVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IllegalArgumentException | JSONException unused2) {
            Objects.requireNonNull(glnVar);
            umiVar.d(new y1n(glnVar, b)).a(null);
        }
    }
}
