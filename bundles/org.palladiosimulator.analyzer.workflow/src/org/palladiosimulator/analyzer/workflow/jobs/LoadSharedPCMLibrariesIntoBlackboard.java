package org.palladiosimulator.analyzer.workflow.jobs;

import org.eclipse.emf.common.util.URI;

import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class LoadSharedPCMLibrariesIntoBlackboard extends SequentialBlackboardInteractingJob<MDSDBlackboard> {
    public static final URI PCM_PALLADIO_RESOURCE_TYPE_URI = URI
        .createURI("pathmap://PCM_MODELS/Palladio.resourcetype");
    public static final URI PCM_PALLADIO_PRIMITIVE_TYPE_REPOSITORY_URI = URI
        .createURI("pathmap://PCM_MODELS/PrimitiveTypes.repository");

    public LoadSharedPCMLibrariesIntoBlackboard(String partitionId) {
        add(new LoadModelIntoBlackboardJob(PCM_PALLADIO_PRIMITIVE_TYPE_REPOSITORY_URI, partitionId));
        add(new LoadModelIntoBlackboardJob(PCM_PALLADIO_RESOURCE_TYPE_URI, partitionId));
    }
}
