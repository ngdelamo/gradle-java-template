package library.di;

import dagger.Component;
import library.Library;

@Component(modules = {TestModule.class})
public interface TestComponent {
    Library library();
}
