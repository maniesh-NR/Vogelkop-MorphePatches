package defpackage;

import com.opera.android.bar.TopToolbarContainer;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class lvl implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pvl b;

    public /* synthetic */ lvl(pvl pvlVar, byte b) {
        this.a = b;
        this.b = pvlVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        pvl pvlVar = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                TopToolbarContainer topToolbarContainer = pvlVar.j;
                i7f i7fVar = (i7f) pvlVar.h;
                g7f g7fVarC = u35.c(i7fVar, i7fVar);
                while (g7fVarC.hasNext()) {
                    ((y43) g7fVarC.next()).getClass();
                }
                if (fFloatValue != 0.0f) {
                    if (fFloatValue == 1.0f) {
                        topToolbarContainer.setLongClickable(true);
                        break;
                    }
                } else {
                    topToolbarContainer.setLongClickable(false);
                    break;
                }
                break;
            case 1:
                float fFloatValue2 = ((Float) obj).floatValue();
                i7f i7fVar2 = (i7f) pvlVar.h;
                g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
                while (g7fVarC2.hasNext()) {
                    ((y43) g7fVarC2.next()).v(fFloatValue2);
                }
                break;
            default:
                x43 x43Var = (x43) obj;
                i7f i7fVar3 = (i7f) pvlVar.h;
                g7f g7fVarC3 = u35.c(i7fVar3, i7fVar3);
                while (g7fVarC3.hasNext()) {
                    ((y43) g7fVarC3.next()).O(x43Var);
                }
                break;
        }
    }
}
