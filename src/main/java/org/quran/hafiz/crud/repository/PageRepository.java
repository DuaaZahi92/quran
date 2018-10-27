package org.quran.hafiz.crud.repository;

import org.quran.hafiz.crud.entity.Page;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 12 May, 2018
 * Time: 7:16 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
public interface PageRepository extends CrudRepository<Page,Short> {
    public Page findByStartAyaId(Short id);
    public Page findByEndAyaId(Short id);
}
