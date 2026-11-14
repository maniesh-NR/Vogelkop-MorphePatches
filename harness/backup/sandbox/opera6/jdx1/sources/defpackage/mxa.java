package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.opera.hype.image.editor.ImageEditorActivity;
import java.util.List;

/* loaded from: classes.dex */
public final class mxa extends t7n implements r7n {
    public final pki a;
    public final tcc b;
    public final Bundle c;
    public final Context d;
    public final Uri e;
    public final List f;
    public final ra5 g;

    public mxa(ImageEditorActivity imageEditorActivity, Bundle bundle, Context context, Uri uri, List list, ra5 ra5Var) {
        this.a = imageEditorActivity.getSavedStateRegistry();
        this.b = imageEditorActivity.getLifecycle();
        this.c = bundle;
        this.d = context;
        this.e = uri;
        this.f = list;
        this.g = ra5Var;
    }

    public final l7n a(Class cls, dde ddeVar) {
        String str = (String) ddeVar.a.get(u7n.a);
        if (str == null) {
            qp2.n("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        pki pkiVar = this.a;
        if (pkiVar == null) {
            gki gkiVarA = kki.a(ddeVar);
            qie qieVar = nb6.j;
            qie qieVar2 = qieVar != null ? qieVar : null;
            Context context = this.d;
            return new lxa(context, qieVar2, this.e, this.f, this.g, new oam(context), gkiVarA);
        }
        hki hkiVarK = z4o.K(pkiVar, this.b, str, this.c);
        gki gkiVar = hkiVarK.b;
        qie qieVar3 = nb6.j;
        qie qieVar4 = qieVar3 != null ? qieVar3 : null;
        Context context2 = this.d;
        lxa lxaVar = new lxa(context2, qieVar4, this.e, this.f, this.g, new oam(context2), gkiVar);
        lxaVar.b("androidx.lifecycle.savedstate.vm.tag", hkiVarK);
        return lxaVar;
    }

    public final l7n c(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            qp2.o("Local and anonymous classes can not be ViewModels");
            return null;
        }
        tcc tccVar = this.b;
        if (tccVar == null) {
            yt7.k("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        hki hkiVarK = z4o.K(this.a, tccVar, canonicalName, this.c);
        gki gkiVar = hkiVarK.b;
        qie qieVar = nb6.j;
        qie qieVar2 = qieVar != null ? qieVar : null;
        Context context = this.d;
        lxa lxaVar = new lxa(context, qieVar2, this.e, this.f, this.g, new oam(context), gkiVar);
        lxaVar.b("androidx.lifecycle.savedstate.vm.tag", hkiVarK);
        return lxaVar;
    }

    public final void d(l7n l7nVar) {
        pki pkiVar = this.a;
        if (pkiVar != null) {
            z4o.l(l7nVar, pkiVar, this.b);
        }
    }
}
