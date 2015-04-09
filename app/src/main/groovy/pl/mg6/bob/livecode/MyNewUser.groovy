package pl.mg6.bob.livecode

import android.view.View
import groovy.transform.Canonical
import groovy.transform.CompileStatic
import groovy.transform.Immutable

@CompileStatic
@Canonical
final class MyNewUser {

    String fullName
    boolean admin
    List<User> friends

    void xx() {
        MyNewUser u = null

        View view = null
        view.onClickListener = this.&onMyClick

        def adminFriends = u.friends.findAll { user -> user.admin }
                .collect { it.fullName }
                .join(", ")
    }

    private void onMyClick(View view) {

    }
}
