package defpackage;

import android.view.View;
import com.opera.hype.image.editor.EditImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ws7 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditImage b;

    public /* synthetic */ ws7(EditImage editImage, byte b) {
        this.a = b;
        this.b = editImage;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        EditImage editImage = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                qq6 qq6Var = editImage.m;
                if (qq6Var != null) {
                    nak nakVar = ((ywa) qq6Var.b).g0().m;
                    nakVar.getClass();
                    nakVar.k((Object) null, bool);
                }
                break;
            default:
                i97 i97Var = (i97) obj;
                editImage.d.b.set(i97Var.b);
                h6n it = new g6n(editImage).iterator();
                while (true) {
                    h6n h6nVar = it;
                    if (!h6nVar.hasNext()) {
                        break;
                    } else {
                        Object tag = ((View) h6nVar.next()).getTag(2131363169);
                        bfl bflVar = tag instanceof bfl ? (bfl) tag : null;
                        if (bflVar != null) {
                            bflVar.d(i97Var);
                        }
                    }
                }
        }
        return Unit.a;
    }
}
