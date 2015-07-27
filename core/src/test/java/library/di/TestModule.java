package library.di;

import dagger.Module;
import dagger.Provides;
import library.Library;

@Module
public class TestModule {
    @Provides
    Library provideLibrary() {
        return new Library();
    }
}
