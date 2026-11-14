package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ozo {
    public static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final ArrayList a = new ArrayList();

    public final wxo a(View view) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wxo wxoVar = (wxo) obj;
            if (wxoVar.a.get() == view) {
                return wxoVar;
            }
        }
        return null;
    }
}
