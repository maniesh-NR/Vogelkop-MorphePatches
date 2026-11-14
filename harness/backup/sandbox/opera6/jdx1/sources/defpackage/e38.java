package defpackage;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e38 {
    public final Object a;
    public volatile Object b;

    public e38() {
        this.a = new ArrayList();
    }

    public e38(qfb qfbVar) {
        this.a = qfbVar;
    }

    public final v97 a() {
        if (((v97) this.b) == null) {
            synchronized (this) {
                if (((v97) this.b) == null) {
                    File cacheDir = ((v61) ((qfb) this.a).b).a.getCacheDir();
                    vzk vzkVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                    if (file != null && (file.mkdirs() || (file.exists() && file.isDirectory()))) {
                        vzkVar = new vzk();
                        vzkVar.c = new esg((byte) 13);
                        vzkVar.b = file;
                        vzkVar.a = new ivg((byte) 3);
                    }
                    this.b = vzkVar;
                }
                if (((v97) this.b) == null) {
                    this.b = new s16();
                }
            }
        }
        return (v97) this.b;
    }

    public final void b() {
        Serializable serializable = (Serializable) this.b;
        if (serializable != null) {
            List<Function1> listK0 = CollectionsKt.k0((ArrayList) this.a);
            ((ArrayList) this.a).clear();
            for (Function1 function1 : listK0) {
                if (function1 != null) {
                    function1.invoke(serializable);
                }
            }
        }
    }
}
