/**
 * Repository interface for BuddyInfo
 *
 * @author Hoang Bui 101029049
 */
package hbui.lab;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bud", path = "bud")
public interface BuddyInfoRepo extends PagingAndSortingRepository<BuddyInfo, Long> {
    List<BuddyInfo> findByName(String name);

    BuddyInfo findById(long id);
}
