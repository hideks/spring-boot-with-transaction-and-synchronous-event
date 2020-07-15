package com.hidekscorp.pocs.repositories

import com.hidekscorp.pocs.entities.Poc
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PocRepository: JpaRepository<Poc, Long>