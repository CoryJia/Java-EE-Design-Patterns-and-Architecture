package dependencyinjection;

import javax.inject.Inject;

public class Target {
    @Inject
    @Favorites
    Subject subject;
}
