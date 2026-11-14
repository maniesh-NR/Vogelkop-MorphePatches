package defpackage;

import com.opera.android.undo.UndoBar;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ax implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cx b;

    public /* synthetic */ ax(cx cxVar, byte b) {
        this.a = b;
        this.b = cxVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cx cxVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                UndoBar undoBar = cxVar.j;
                if (undoBar != null) {
                    undoBar.c(Collections.singletonList(str));
                }
                break;
            default:
                UndoBar undoBar2 = cxVar.j;
                if (undoBar2 != null) {
                    undoBar2.c(Collections.singletonList(str));
                }
                break;
        }
        return Unit.a;
    }
}
