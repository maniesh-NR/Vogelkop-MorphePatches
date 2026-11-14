package androidx.webkit;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WebViewStartUpConfig {
    public final Executor a;
    public final boolean b;
    public final HashSet c;

    public static final class Builder {
        public final Executor a;
        public boolean b = true;
        public HashSet c = null;

        public Builder(Executor executor) {
            this.a = executor;
        }

        public WebViewStartUpConfig build() {
            return new WebViewStartUpConfig(this.a, this.b, this.c);
        }

        public Builder setProfilesToLoadDuringStartup(Set<String> set) {
            if (this.b) {
                this.c = new HashSet(set);
                return this;
            }
            qp2.o("Can't specify profiles to load without running UI thread startup tasks");
            return null;
        }

        public Builder setShouldRunUiThreadStartUpTasks(boolean z) {
            if (this.c == null || z) {
                this.b = z;
                return this;
            }
            qp2.o("Can't specify profiles to load without running UI thread startup tasks");
            return null;
        }
    }

    public WebViewStartUpConfig(Executor executor, boolean z, HashSet hashSet) {
        this.a = executor;
        this.b = z;
        this.c = hashSet;
    }

    public Executor getBackgroundExecutor() {
        return this.a;
    }

    public Set<String> getProfilesToLoadDuringStartup() {
        return this.c;
    }

    public boolean shouldRunUiThreadStartUpTasks() {
        return this.b;
    }
}
