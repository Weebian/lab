/**
 * Repository interface for Address Book
 *
 * @author Hoang Bui 101029049
 */

package hbui.lab;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface AddressBookRepo extends PagingAndSortingRepository<AddressBook, Long> {
    AddressBook findById(long id);
}
