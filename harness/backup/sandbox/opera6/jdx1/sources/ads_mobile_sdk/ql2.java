package ads_mobile_sdk;

import defpackage.t3p;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ql2 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public k9h b = null;
    public k9h c = null;

    public final void a() throws GeneralSecurityException {
        if (this.a.getAndSet(true)) {
            return;
        }
        try {
            kjj.a();
            this.b = (k9h) mzg.m(new String(b8h.c("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).x();
            this.c = (k9h) mzg.m(new String(b8h.c("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).x();
        } catch (Exception e) {
            t3p.k("Failed to verify program", e);
        }
    }

    public final boolean a(x7 x7Var) throws GeneralSecurityException {
        byte[] bArrC = x7Var.p().q().q().c();
        byte[] bArrC2 = x7Var.p().p().c();
        try {
            try {
                a();
                k9h k9hVar = this.b;
                if (k9hVar == null) {
                    throw new GeneralSecurityException();
                }
                k9hVar.a(bArrC, bArrC2);
                return true;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            k9h k9hVar2 = this.c;
            if (k9hVar2 == null) {
                return false;
            }
            k9hVar2.a(bArrC, bArrC2);
            return true;
        }
    }
}
