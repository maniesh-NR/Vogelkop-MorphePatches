package defpackage;

import android.database.Cursor;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class mic implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mic(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        im7 im7Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i != -1 && (im7Var = ((ListPopupWindow) obj).c) != null) {
                    im7Var.h = false;
                    break;
                }
                break;
            default:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.p.getText();
                Cursor cursor = searchView.O.c;
                if (cursor != null) {
                    if (!cursor.moveToPosition(i)) {
                        searchView.n(text);
                        break;
                    } else {
                        String strC = searchView.O.c(cursor);
                        if (strC == null) {
                            searchView.n(text);
                            break;
                        } else {
                            searchView.n(strC);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        byte b = this.a;
    }
}
